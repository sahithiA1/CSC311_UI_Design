# Farmingdale Student Portal

## Project Overview

This project is a JavaFX-based student portal interface created for CSC311.

The application was designed using JavaFX, FXML, Scene Builder, and CSS. The goal of the project was to create a clean, consistent, and user-friendly multi-screen interface for a student portal.

## Screens Included

The application contains four main screens:

1. Splash Screen
   - Displays the Farmingdale Student Portal branding
   - Includes a progress bar and Continue button
   - Continue navigates to the Login screen

2. Login Screen
   - Allows the user to enter an email address and password
   - Sign In navigates to the Landing screen
   - Create Account navigates to the Registration screen

3. Landing Screen
   - Displays the student dashboard
   - Includes:
     - My Courses
     - Upcoming Events
     - Assignments
     - Campus Updates
   - Log Out returns the user to the Login screen

4. Registration Screen
   - Includes fields for:
     - Full Name
     - Email Address
     - Password
     - Confirm Password
   - Create Account returns the user to the Login screen
   - Sign In also returns the user to the Login screen

## Navigation Flow

The application navigation works as follows:

Splash Screen → Login Screen

Login Screen → Landing Screen

Login Screen → Registration Screen

Registration Screen → Login Screen

Landing Screen → Login Screen

## Technologies Used

- Java
- JavaFX
- FXML
- Scene Builder
- CSS
- Maven
- IntelliJ IDEA
- Git
- GitHub

## Design

The portal uses a consistent Farmingdale-inspired color palette with:

- Dark green
- Cream/off-white
- White
- Light mint accents

The interface was designed to keep the screens visually consistent while maintaining a clean and modern layout.

## Project Structure

Java controller files are located in:

`src/main/java/org/example/csc311_ui_design`

FXML and CSS files are located in:

`src/main/resources/org/example/csc311_ui_design`

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure the JavaFX and Maven dependencies are installed.
3. Run `StudentPortalApplication.java`.
4. The application will begin on the Splash screen.
5. Use the buttons and links to navigate between the different screens.

## Author

Sahithi Attada
CSC311
