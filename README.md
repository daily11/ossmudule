
# react-native-oss

## Getting started

`$ npm install react-native-oss --save`

### Mostly automatic installation

`$ react-native link react-native-oss`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.dreamser.screenshotcatch.RNOssPackage;` to the imports at the top of the file
  - Add `new RNOssPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-oss'
  	project(':react-native-oss').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-oss/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-oss')
  	```


## Usage
```javascript
import RNOss from 'react-native-oss';

// TODO: What to do with the module?
RNOss;
```
  