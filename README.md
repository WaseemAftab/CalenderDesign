# CardView-CalenderDesign
Very helpful cardview example for beginners. using linear layout try to teach the deveoper to create a school or bed time schedule for an child protection app or calender.

## Selectable Calender days.

you can select and unselect each of the week day ad also added time text inside the each day. to control the timings of every day schedule.
drawable/Selector are used with items and sub items with 3 pics added in one selector. day_On , day_off and Tik_Mark image also.

```xml
<myxml>
      <selector xmlns:android="http://schemas.android.com/apk/res/android">
    <item android:state_checked="true" >
        <layer-list>
            <item android:drawable="@drawable/sun_on"/>
            <item android:height="18dp" android:width="18dp"  android:bottom="8dp" android:right="5dp" android:gravity="top|end">
                <bitmap android:src="@drawable/v_day_icon" />
            </item>
        </layer-list>
    </item>
    <item android:drawable="@drawable/sun_off" android:state_checked="false" />
</selector>
</myxml>
```

### Preview

<img src="https://github.com/Wassi01/CardView-CalenderDesign/blob/master/images/Screenshot_2020-02-05-17-23-56.png" width="250" />
<img src="https://github.com/Wassi01/CardView-CalenderDesign/blob/master/images/Screenshot_2020-02-05-17-24-09.png" width="250" />
