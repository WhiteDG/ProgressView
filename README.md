# ProgressView
[中文版点我](https://github.com/WhiteDG/ProgressView/blob/master/README_CN.md)

ProgressView is a custom view that extends ProgressBar to implement circular and horizontal progress bars with numerical indicators.

## Screenshots

<img src='https://github.com/WhiteDG/ProgressView/blob/master/screenshot/demo.gif' height='600'/> <span>&nbsp;&nbsp;&nbsp;&nbsp;</span> <img src='https://github.com/WhiteDG/ProgressView/blob/master/screenshot/preview.gif' height='600'/>

## Installation
Add the depedency in your build.gradle. The library is distributed via jCenter.
```
dependencies {
    compile 'com.white:progressview:1.0.1'
}
```
## Usage

1. In the XML

Add the `ProgressView` to `layout.xml` and configure the attributes.
```
<!-- Horizontal style -->
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
    
<!-- Circle style -->
<com.white.progressview.CircleProgressView
      android:id="@+id/circle_progress_normal"
      android:layout_width="wrap_content"
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
2. In the Activity

You can also configure attributes directly in the activity.
```
horizontalProgressView.setXXXX();
// for example:
horizontalProgressView.setTextVisible(false);
horizontalProgressView.setReachBarSize(4);
horizontalProgressView.setProgressPosition(HorizontalProgressView.TOP);
...
```
and set progress with animation in time
```
HorizontalProgressView horizontalProgressView = (HorizontalProgressView) findViewById(R.id.progress100);
// set progress 100 with anim in 2500ms 
horizontalProgressView.setProgressInTime(100,2500);
// set progress from 20 to 100 with anim in 2500ms 
horizontalProgressView.setProgressInTime(0,100,2500);
// reset current progress with anim in 2500ms 
horizontalProgressView.runProgressAnim(2500);

CircleProgressView circleProgressView = (CircleProgressView) findViewById(R.id.circle_progress_normal);
...
// same as HorizontalProgressView
circleProgressView.setProgressInTime(100,2500);
    
```

## Attributes

#### HorizontalProgressView

Name | Description
:---:|:---:
progressNormalColor | set the normal bar color
progressReachColor | set the reach bar color
progressTextColor | set the progress text color
progressTextSize | set the progress text size
progressTextOffset | set the progress text offset
progressNormalSize | set the normal bar size
progressReachSize | set the reach bar size
progressTextPosition | set the progress text position(CENTER/BOTTOM/TOP)
progressTextVisible | is show the progress text
progressTextSkewX | set the progress text skewx
progressTextPrefix | set the progress text prefix
progressTextSuffix | set the progress text suffix(default '%')

#### CircleProgressView

Name | Description
:---:|:---:
progressNormalColor | set the normal bar color
progressReachColor | set the reach bar color
progressTextColor | set the progress text color
progressTextSize | set the progress text size
progressTextOffset | set the progress text offset
progressNormalSize | set the normal bar size
progressReachSize | set the reach bar size
radius | set the circle radius
progressTextVisible | is show the progress text
progressTextSkewX |set the progress text skewx
progressTextPrefix | set the progress text prefix
progressTextSuffix | set the progress text suffix(default '%')
progressStartArc | set the startArc of reach area
progressStyle | set the style of CircleProgressView(Normal/FillInner/FillInnerArc)
reachCapRound | set the reach bar cap round or not(only for style Normal)
innerBackgroundColor | set the inner background color(only for style Normal)
innerProgressColor | set the inner progress color(only for style FillInner)
innerPadding | set the padding between the inner and outer circles(only for style FillInnerArc)
outerColor | set the outer circle color(only for style FillInnerArc)
outerSize | set outer circle width(only for style FillInnerArc)

## LICENSE

```
Copyright 2017 Wh1te

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
