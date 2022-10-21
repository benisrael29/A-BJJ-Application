# The One BJJ Platform to Rule Them All

## How to Run
1. Download and install Android Studio
2. Connect to this repository you may need to set up a token. 
3. Install a fire TV emulator. 
4. Build and run. 


## Resources
 - https://developer.android.com/guide

# Documentation 
Documentation from android studio guides mostly. 

## Architecture 
- Keep in mind that mobile devices are also resource-constrained, so at any time, the operating system might kill some app processes to make room for new ones.
- Because these events aren't under your control, you shouldn't store or keep in memory any application data or state in your app components, and your app components shouldn't depend on each other.
- A UI Layer and a Data layer will help decoupling. 
  - The data layer exposes application data to the rest of the app and contains the vast majority of business logic of your app.
  - The UI layer displays the application data on the screen and serves as the primary point of user interaction.
  - Components in the UI layer such as composables, activities, or ViewModels shouldn't interact directly with a data source.

# Design

 ![image](https://user-images.githubusercontent.com/62453991/197089671-655d19bc-a6c4-4edb-ab8a-770927b6b46f.png)

![image](https://user-images.githubusercontent.com/62453991/197089708-42c92e18-d9ec-4a9b-b4e9-6e83683bf9f7.png)
