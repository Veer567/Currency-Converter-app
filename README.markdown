# Currency Converter App

A modern, offline Android currency converter app built with **Kotlin** using a static currency list and exchange rates. The app features a clean, Material Design-based UI with accessibility support, allowing users to convert between various currencies seamlessly.
![Image Alt](![image](WhatsApp Image 2025-06-07 at 19.31.41_58e9ab71.jpg))

## Table of Contents
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Offline Conversion**: Convert between 10+ currencies (e.g., USD, EUR, INR) using static exchange rates relative to USD.
- **Modern UI**: Material Design components with a card-based layout, purple accents, and a custom swap button.
- **Accessibility**: Fully accessible with TalkBack support, descriptive hints, and adequate touch target sizes (48dp minimum).
- **Swap Functionality**: Swap source and target currencies with a single tap on the “Swap” button.
- **Error Handling**: Validates input for empty or invalid amounts with error messages.
- **Customizable**: Extend the currency list and rates in `CurrencyData.kt`.

## Prerequisites
- **Android Studio**: Version 2023.3.1 or later (e.g., Hedgehog or Koala).
- **Kotlin**: Version 1.9.0 or later.
- **Minimum SDK**: API 21 (Lollipop).
- **Device/Emulator**: Android device or emulator running API 21 or higher.

## Installation
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/currency-converter.git
   ```
2. **Open in Android Studio**:
   - Open Android Studio and select `Open an existing project`.
   - Navigate to the cloned `currency-converter` folder and click `OK`.
3. **Sync Project**:
   - Click `Sync Project with Gradle Files` to download dependencies.
   - Ensure the following dependency is in `build.gradle.kts` (app-level):
     ```kotlin
     dependencies {
         implementation("com.google.android.material:material:1.9.0")
     }
     ```
4. **Run the App**:
   - Connect an Android device or start an emulator.
   - Click `Run` in Android Studio to build and install the app.

## Usage
1. **Launch the App**:
   - Open the app on your device/emulator.
2. **Enter Amount**:
   - Type an amount (e.g., `100.50`) in the “Enter amount to convert” field.
3. **Select Currencies**:
   - Choose a source currency (e.g., USD - United States Dollar) from the first dropdown.
   - Choose a target currency (e.g., EUR - Euro) from the second dropdown.
4. **Swap Currencies**:
   - Tap the “Swap” button to switch the source and target currencies.
5. **Convert**:
   - Tap the “Convert” button to see the result (e.g., “Result: 85.00 EUR”).
6. **Handle Errors**:
   - If the amount is empty or invalid, an error message appears below the input field.

## Project Structure
- **`app/src/main/java/.../MainActivity.kt`**: Handles UI logic, currency conversion, and swap functionality.
- **`app/src/main/java/.../CurrencyData.kt`**: Defines static currency list and exchange rates (relative to USD).
- **`app/src/main/res/layout/activity_main.xml`**: UI layout with Material Design components (TextInputLayout, Spinners, MaterialButton).
- **`app/src/main/res/drawable/ic_swap.xml`**: Vector drawable for the swap button icon.
- **`app/src/main/res/values/colors.xml`**: Color definitions for the app’s theme.
- **`app/src/main/res/values/themes.xml`**: Material theme configuration.

---

*Built with ❤️ using Kotlin and Android Studio.*
