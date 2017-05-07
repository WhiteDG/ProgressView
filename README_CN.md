# ProgressView

ProgressView是一个继承Progressbar的进度视图，目前实现了带数字进度的水平进度条以及圆形进度条，圆形进度条包括三种风格：普通环形进度，内部垂直填充进度以及内部环形填充进度。

## Demo
![demo](https://github.com/WhiteDG/ProgressView/blob/master/screenshot/demo.gif)


## 下载

在build.gradle中添加如下引用
```
dependencies {
    compile 'com.white:progressview:1.0.0'
}
```

## 使用

1. 布局文件

在布局文件中添加ProgressView并设置相关自定义属性
```
// 水平进度条
<com.white.progressview.HorizontalProgressView
    android:id="@+id/progress100"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:padding="10dp"
    android:progress="100"
    app:progressReachColor="@color/colorPrimary"
    app:progressTextColor="@color/colorPrimary"
    app:progressTextVisible="true"
    />
    
// 圆形进度条
<com.white.progressview.CircleProgressView
      android:id="@+id/circle_progress_normal"
      android:layout_width="0dp"
      android:layout_height="wrap_content"
      android:layout_weight="1"
      android:padding="10dp"
      android:progress="68"
      app:progressNormalSize="4dp"
      app:progressReachSize="4dp"
      app:progressStyle="Normal"
      app:radius="28dp"
      />
```
2. Java代码

可以通过代码设置所有相关的自定义属性
```
horizontalProgressView.setXXXX();
// 例如:
horizontalProgressView.setTextVisible(false);
horizontalProgressView.setReachBarSize(4);
horizontalProgressView.setProgressPosition(HorizontalProgressView.TOP);
...
```
也可以设置进度动画，指定动画时长
```
HorizontalProgressView horizontalProgressView = (HorizontalProgressView) findViewById(R.id.progress100);
// 从0到100执行2500ms的动画 
horizontalProgressView.setProgressInTime(100,2500);
// 从20到100执行2500ms的动画 
horizontalProgressView.setProgressInTime(0,100,2500);
// 从0到当前进度执行2500ms的动画 
horizontalProgressView.runProgressAnim(2500);

CircleProgressView circleProgressView = (CircleProgressView) findViewById(R.id.circle_progress_normal);
...
// 和HorizontalProgressView一样的方法
circleProgressView.setProgressInTime(100,2500);
    
```

## 可配置属性

#### HorizontalProgressView

属性名 | 属性说明
---|---
progressNormalColor | 设置正常状态下进度条颜色
progressReachColor | 设置已到达的进度条颜色
progressTextColor | 设置进度文本颜色
progressTextSize | 设置进度文本大小
progressTextOffset | 设置进度文本与进度条的边距
progressNormalSize | 设置正常状态下进度条大小
progressReachSize | 设置已到达的进度条大小
progressTextPosition | 设置进度文本位置(CENTER/BOTTOM/TOP)(居中/底部/顶部)
progressTextVisible | 设置是否显示进度文本
progressTextSkewX | 设置进度文本倾斜角度(斜体)
progressTextPrefix | 设置进度文本前缀
progressTextSuffix | 设置进度文本后缀(默认是%)
#### CircleProgressView

属性名 | 属性说明
---|---
progressNormalColor | 设置正常状态下进度条颜色
progressReachColor | 设置已到达的进度条颜色
progressTextColor | 设置进度文本颜色
progressTextSize | 设置进度文本大小
progressTextOffset | 设置进度文本与进度条的边距
progressNormalSize | 设置正常状态下进度条大小
progressReachSize | 设置已到达的进度条大小
radius | 设置圆形半径
progressTextVisible | 设置是否显示进度文本
progressTextSkewX | 设置进度文本倾斜角度(斜体)
progressTextPrefix | 设置进度文本前缀
progressTextSuffix | 设置进度文本后缀(默认是%)
progressStartArc | 设置进度值起始角度
progressStyle | 设置圆形进度样式(Normal/FillInner/FillInnerArc)(普通环形/内部垂直填充/内部环形填充)
reachCapRound | 设置进度边界是否使用圆角(使用Normal样式时有用)
innerBackgroundColor | 设置内部背景颜色(使用Normal样式时有用)
innerProgressColor | 设置内部进度颜色(使用FillInner样式时有用)
innerPadding | 设置内部圆与外部圆的间距(使用FillInnerArc样式时有用)
outerColor | 设置外部圆环颜色(使用FillInnerArc样式时有用)
outerSize | 设置外部圆环大小(使用FillInnerArc样式时有用)

