# Exoplayer → AndroidX Media3
- ExoPlayer 팀은 `r2.19.0` 버전을 마지막으로 릴리스
- 새로운 라이브러리인 AndroidX Media3로 마이그레이션을 권장
- https://developer.android.com/jetpack/androidx/releases/media3?hl=ko

```java
implementation 'androidx.media3:media3-exoplayer:1.3.1'
implementation 'androidx.media3:media3-exoplayer-dash:1.3.1'
implementation 'androidx.media3:media3-ui:1.3.1'
```

## Exoplayer 초기화

```java
// 기존 ExoPlayer 초기화 코드 (기존 ExoPlayer)
player = ExoPlayerFactory.newSimpleInstance(context);

// Media3로 변경된 초기화 코드
player = new ExoPlayer.Builder(context).build();
```

## MediaSource 생성

```java
// 기존 ExoPlayer MediaSource 생성 코드
MediaSource mediaSource = new ProgressiveMediaSource.Factory(new DefaultHttpDataSourceFactory("user-agent"))
        .createMediaSource(Uri.parse(url));

// Media3 MediaSource 생성 코드
MediaSource mediaSource = new ProgressiveMediaSource.Factory(new DefaultHttpDataSource.Factory())
        .createMediaSource(MediaItem.fromUri(Uri.parse(url)));
```

## PlayerView 설정

```java
// 기존 ExoPlayer PlayerView 설정 코드
playerView.setPlayer(player);

// Media3 PlayerView 설정 코드
playerView.setPlayer(player);
```

## 레이아웃 파일 변경

```java
<!-- 기존 ExoPlayer PlayerView -->
<com.google.android.exoplayer2.ui.PlayerView
    android:id="@+id/player_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />

<!-- Media3 PlayerView -->
<androidx.media3.ui.PlayerView
    android:id="@+id/player_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```

## Media3의 일부 API는 `@UnstableApi`로 표시되어 있으며, 이를 사용하려면 `@OptIn` 어노테이션을 추가해야 함

```java
@OptIn(markerClass = androidx.media3.common.util.UnstableApi.class)
private MediaSource buildMediaSource(Uri uri) {
    return new ProgressiveMediaSource.Factory(new DefaultHttpDataSource.Factory())
            .createMediaSource(MediaItem.fromUri(uri));
}
```
