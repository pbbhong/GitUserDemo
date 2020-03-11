#Git User List App - Android Architecture Components

This is a demo Android application in order to practice Android Architecture Components. It uses the api for getting the github user info (https://developer.github.com/v3/users). I uses this project as a demo for the Android Kotlin MVVM architecture.

##Demo

This demo will list all the users on Github.


## Libraries used in this project

- [Android architecture components](https://developer.android.com/topic/libraries/architecture/index.html)
  - [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel.html)
  - [LiveData](https://developer.android.com/topic/libraries/architecture/livedata.html)
  - [Room](https://developer.android.com/topic/libraries/architecture/room.html)
- [Koin](https://github.com/Ekito/koin)
- [Retrofit](https://github.com/square/retrofit)
- [Picasso](https://github.com/square/picasso)
- [CircleImageView](https://github.com/hdodenhof/CircleImageView)
- [JUnit and Mockito](https://developer.android.com/training/testing/unit-testing/local-unit-tests.html)


## Architecture
https://miro.medium.com/max/1440/1*-yY0l4XD3kLcZz0rO1sfRA.png

The App will use webservice to get the git users data. It will pass the data to the list and store the data to the database. If internet to connect to the Git server, it will retrieve the data from database and display the data to the list.
