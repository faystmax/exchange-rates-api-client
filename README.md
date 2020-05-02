# Exchange Rates Java Api Client

[![Jitpack](https://jitpack.io/v/faystmax/exchange-rates-api-client.svg)](https://jitpack.io/#faystmax/exchange-rates-api-client)
[![Build](https://github.com/faystmax/exchange-rates-api-client/workflows/Build/badge.svg?branch=master)](https://github.com/faystmax/exchange-rates-api-client/actions?query=workflow%3A%22Java+CI%22)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/8b3988dc0d7e4bb381fd6dabcb381999)](https://www.codacy.com/manual/faystmax/exchange-rates-api-client?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=faystmax/exchange-rates-api-client&amp;utm_campaign=Badge_Grade)
[![GitHub license](https://img.shields.io/badge/License-MIT-blue.svg)](https://github.com/faystmax/exchange-rates-api-client/blob/master/LICENSE.md)

Unofficial Java Api Client for <https://exchangeratesapi.io/> made with Retrofit 2.7

## Installation

Add the JitPack repository to your build file

```groovy
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Add dependency
```groovy
dependencies {
    implementation 'com.github.faystmax:exchange-rates-api-client:v1.0.0'
}
```
## Build
To build this project run this from base directory:
```
./gradlew clean build
```
For windows users:
```
gradlew.bat clean build
```

## License

This project is licensed under the terms of the MIT license - see the [LICENSE.md](LICENSE.md) file for details