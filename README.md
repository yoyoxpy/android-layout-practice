# android-layout-practice

A practice project for Android layout basics. Each concept is isolated in its own demo Activity so you can see exactly what each attribute does.

## Demos

| Activity | Topic |
| --- | --- |
| `TextViewActivity` | Basic `TextView` usage |
| `TextColorActivity` | Text color |
| `TextSizeActivity` | Text size units |
| `ViewBorderActivity` | View borders / backgrounds |
| `ViewGravityActivity` | `gravity` vs `layout_gravity` |
| `ViewMarginActivity` | Margins and spacing |

`MainActivity` is the entry point; [util/Utils.java](chapter03/src/main/java/com/example/chapter03/util/Utils.java) holds shared helpers.

## Run

Open the project in Android Studio and run the **chapter03** module on an emulator or device.

## Project structure

```
chapter03/
└── src/main/
    ├── java/com/example/chapter03/   # MainActivity + one Activity per topic
    └── res/layout/                   # activity_*.xml demo layouts
```
