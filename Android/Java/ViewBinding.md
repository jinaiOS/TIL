# ViewBinding
```java
class BaseActivity<B extends ViewDataBinding>

   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, getLayoutResId());
        init();
        
   }
   
   
    @LayoutRes
    protected abstract int getLayoutResId();

    // BaseActivity를 상속받는 클래스에서 초기화 로직을 처리하도록 강제
    protected abstract void init();

    // 데이터 바인딩된 뷰 바인딩 객체를 반환
    protected B getBinding() {
        return binding;
    }
```

```java
class StartActivity extends BaseActivity<LayoutStartBinding>

@Override
    protected int getLayoutResId() {
        return R.layout.layout_start;
    }

    @Override
    protected void init() {

    }
```

- LayoutStartBinding → 자동생성 됨!
