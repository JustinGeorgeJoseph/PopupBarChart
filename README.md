<h1 align="center">PopupBarChart :bar_chart: </h1></br>
<p align="center">
PopupBarChart :bar_chart: can shows a tooltip when user click on the bar :heart_eyes:🤩
</p>

<p align="center">
  <a href="https://androidweekly.net/issues/issue-514"><img alt="License" src="https://justingeorgejoseph.github.io/badges/popubarchart_android_weekly.svg"/></a>
  <a href="https://opensource.org/licenses/Apache-2.0"><img alt="License" src="https://img.shields.io/badge/License-Apache%202.0-blue.svg"/></a>
  <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>
</p> <br>

<p align="center">
<img src="/demo/popup_bar_chart.jpg" width="300" height="1200"/>
</p>

## Including in your project 
[![](https://jitpack.io/v/JustinGeorgeJoseph/PopupBarChart.svg)](https://jitpack.io/#JustinGeorgeJoseph/PopupBarChart)

### Gradle 
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
And add a dependency code to your **module**'s `build.gradle` file.
```
dependencies {
	        implementation 'com.github.JustinGeorgeJoseph:PopupBarChart:Tag'
	}
```

## Usage
### PopupBarChart in xml layout
We can use `PopupBarChart` without any customized attributes.<br>
Initally there won't be any content you have add those contents dynamically.

``` 
<com.justin.popupbarchart.PopupBarChart
        android:id="@+id/customBarchart"
        android:layout_width="match_parent"
        android:background="@color/chart_bg"
        android:layout_height="300dp"

        app:chart_bar_round_corner="true"
        app:chart_bar_size="@dimen/bar_size"
        app:chart_bar_start_color="@color/green_start"
        app:chart_bar_end_color="@color/green_end"
        app:chart_bar_secondary_color="@color/grey_secondary"

        app:chart_bar_text_color="@color/white"
        app:chart_bar_text_family="@font/roboto_medium"
        app:chart_bar_text_size="14sp"

        app:chart_bar_tooltip_bg_color="@android:color/black"

        app:chart_bar_tooltip_subtitle_text_color="@color/white"
        app:chart_bar_tooltip_subtitle_text_family="@font/rubik_medium"
        app:chart_bar_tooltip_subtitle_text_size="10sp"

        app:chart_bar_tooltip_title_text_color="@color/white"
        app:chart_bar_tooltip_title_text_family="@font/rubik_medium"
        app:chart_bar_tooltip_title_text_size="12sp"

        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
```

 ### Attribute descriptions
 
```
app:chart_bar_round_corner="true" // [true,false] - sets whether bar need round edges or not.
```

```
app:chart_bar_size="16dp" //[Integer] - sets the width of each bars.
```

```
app:chart_bar_start_color="@color/green_start" //[Color]
app:chart_bar_end_color="@color/green_end" //[Color] - sets the color of the bar char, start and end colors are 
                                                      used to support the gradient colors. If you need only 
                                                      one color set same color as start and end color.
```

```
app:chart_bar_secondary_color="@color/grey_secondary" //[Color] - Use secondary color as background 
                                                                  color of progress bar
```
```
app:chart_bar_text_color="@color/white"//[color] - color code for text in the bar chart
```
```
app:chart_bar_text_size="14sp" //[dimen] - size of text in the bar chart
```
```
app:chart_bar_text_family="@font/roboto_medium" //[Font] - font family for the text in bar chart
```
```
app:chart_bar_tooltip_bg_color="@android:color/black" //[color] -  Tooltip's background color(default will be black)
```
```
app:chart_bar_tooltip_subtitle_text_color="@color/white" //[color] - Tooltip's subtitle text color
```
```
app:chart_bar_tooltip_subtitle_text_size="10sp" //[dimen] - Tooltip's subtitle text size
```
```
app:chart_bar_tooltip_subtitle_text_family="@font/rubik_medium" //[Font] - Tooltip's subtitle font family
```
```
app:chart_bar_tooltip_title_text_size="12sp" //[dimen] - tooltip title text size
```
```
app:chart_bar_tooltip_title_text_color="@color/white" //[color] - tooltip title text color
```
```
app:chart_bar_tooltip_title_text_family="@font/rubik_medium" //[Font] - tooltip title font family
```


### Set graph values
```
findViewById<PopupBarChart>(R.id.customBarchart).apply {
            setGraphValues(
                arrayListOf(
                    GraphValue(
                        day = 1,
                        id = 1,
                        progress = 30,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 2,
                        id = 2,
                        progress = 70,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 3,
                        id = 3,
                        progress = 100,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 4,
                        id = 4,
                        progress = 0,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 5,
                        id = 5,
                        progress = 50,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 6,
                        id = 6,
                        progress = 50,
                        isToday = false,
                        showToolTip = false
                    ),
                    GraphValue(
                        day = 7,
                        id = 7,
                        progress = 25,
                        isToday = false,
                        showToolTip = false
                    ),
                )
            )
        }
```

# License
```xml
Copyright 2022 JustinGeorgeJoseph (Justin George)

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
