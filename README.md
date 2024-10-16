1. Adapter Pattern

Created AudioPlayer interface with a `play(String audioType, String fileName)` method, so it could handle different types of audio files.
Implemented the `MP3Player` class, which can play MP3 files and print a message that file is being played.
Created interfaces for `WAVPlayer` and `AACPlayer`, each with their own play methods (`playWAV()` and `playAAC()`).
Built the `AdvancedAudioPlayer` class to support both WAV and AAC formats.
Created the `AudioAdapter` class to connect `AdvancedAudioPlayer` with `AudioPlayer` by translating the file type into the correct format.
Demonstrated the adapter in the main class, so it can play all MP3, WAV, and AAC files.

2. Bridge Pattern

Created a `Device` interface with methods  `powerOn()`, `powerOff()`, `setChannel(int channel)`, and `setVolume(int volume)`, to define basic device functions.
Implemented concrete device classes like `TVDevice`, `DVDDevice`, and `SoundSystemDevice`.
Created abstract `RemoteControl` class that has a reference to a `Device` and provides methods `powerButtonPressed()` and `setVolume(int volume)`.
Created concrete remote control classes such as `BasicRemote` and `AdvancedRemote`, where added features like `mute()` and `setFavoriteChannel()`.
Demonstrated in the main class how the same remote can control different devices, making it flexible.

3. Composite Pattern 

Creared the abstract `MenuComponent` class with methods `getName()`, `getDesc()`, `getPrice()`, and `print()`. It represents individual menu items and submenus.
Created the `MenuItem` class to represent dishes. Each `MenuItem` has its own name, description, and price.
Created the `Menu` class, which can store a collection of `MenuComponent` objects. This allows the `Menu` to contain both `MenuItem`s and other `Menu`s.
Implemented methods in `Menu` to add, remove, and print menu components.
Demonstrated the composite structure in the main class, showing how a restaurant can have multi-level menus that can be printed hierarchically.


4. Decorator Pattern

Created the `Pizza` interface with methods `getDesc()` and `getCost()`, to allow different types of pizzas to be described and priced.
Implemented base pizza classes like `MargheritaPizza` and `VegetarianPizza`, each returning its own description and cost.
Created an abstract `ToppingDecorator` class that also implements `Pizza`, acting as a wrapper for toppings.
Created concrete decorator classes like `CheeseTopping`, `MushroomTopping`, and `PepperoniTopping`, each of which adds to the base pizza's description and cost.
Demonstrated the flexibility of the system in the main class by dynamically adding multiple toppings to a pizza and showing the final description and cost.

 5. Facade Pattern

Created classes for smart home devices: `Light`, `Thermostat`, `SecuritySystem` and `EntertainmentSystem`, each with their own methods.
Created the `SmartHomeFacade` class, which manages the interaction between these devices. It provides simple methods like `leaveHome()`, `arriveHome()`, `nightMode()`, and `movieMode()`;.
Demonstrated in the main class how a user can control all devices using just a few simple commands, rather than interacting with each device individually.

6. Flyweight Pattern

Created a `Character` class that stores intrinsic state like the character value, font, and size. 
Created a `CharacterFactory` to manage the pool of flyweight character objects. This ensures that only one instance of each character with the same font and size is created, and it is shared across the editor.
Implemented the `TextEditor` class, which uses the `CharacterFactory` to render text by reusing flyweight characters and printing their positions on the screen.
Demonstrated memory savings in the main class by inserting and rendering a large text using shared character objects.

7. Proxy Pattern

Created a `VideoLecture` interface with methods `getInfo()` and `play()`.
Implemented the `RealVideoLecture` class to play real video lecture. Loading is simulated to represent a resource-intensive operation.
Created the `ProxyVideoLecture` class, which implements the `VideoLecture` interface and holds a reference to `RealVideoLecture`. It defers loading the actual video until the `play()` method is called for the first time (lazy loading).
Demonstrated in the main class how the proxy delays loading of video lectures until students start watching them, optimizing resource use for the platform.
