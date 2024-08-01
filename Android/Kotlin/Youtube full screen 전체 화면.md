# Youtube full screen 전체 화면
- 안드로이드 webview는 전체 화면이 지원이 안 된다! custom 해야 함!
- ios는 자동으로 됨

- 대형 삽질을 했던 이유
    - web chrome client 를 새로 선언해서 넣고 있었다 ㅠ

```kotlin
class WebChromeClient(val activity: MainActivity) : WebChromeClient() {
    private var mCustomView: View? = null
    private var mCustomViewCallback: CustomViewCallback? = null
    private var mOriginalSystemUiVisibility = 0

    override fun onHideCustomView() {
        (activity.window.decorView as FrameLayout).removeView(
            mCustomView
        )
        mCustomView = null
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            activity.window.setDecorFitsSystemWindows(false)
            activity.window.insetsController?.hide(WindowInsets.Type.systemBars() or WindowInsets.Type.navigationBars())
            activity.window.insetsController?.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
        else {
            activity.window.decorView.systemUiVisibility =
                (View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                        View.SYSTEM_UI_FLAG_FULLSCREEN or
                        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                        View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                        View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION)
        }
        mCustomViewCallback!!.onCustomViewHidden()
        mCustomViewCallback = null
    }

    override fun onShowCustomView(
        paramView: View,
        paramCustomViewCallback: CustomViewCallback
    ) {
        if (mCustomView != null) {
            onHideCustomView()
            return
        }
        mCustomView = paramView
        mOriginalSystemUiVisibility =
            activity.window.decorView.systemUiVisibility
        mCustomViewCallback = paramCustomViewCallback
        (activity.window.decorView as FrameLayout).addView(
            mCustomView,
            FrameLayout.LayoutParams(-1, -1)
        )
        activity.window.decorView.systemUiVisibility =
            3846 or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
    }
}
```
