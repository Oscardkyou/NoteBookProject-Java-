
# Structured Notebook Project

This project is a console-based application that allows users to manage their notes in a structured manner.

## Structure

The project follows the Model-View-Presenter (MVP) pattern and adheres to the SOLID principles of object-oriented design.

### Model

- **Note**: Represents an individual note with a date, time, and description.
- **Notebook**: Represents a collection of notes and provides methods to add, remove, search, and sort notes.
- **FileHandler**: Provides utility methods to save and load the notebook to/from a file.

### View

- **ConsoleView**: Provides methods for user interactions, displaying messages, and getting user input from the console.

### Presenter

- **NotebookPresenter**: Acts as an intermediary between the model and the view. It contains the logic for user interactions.

## Usage

Run the `Main` class to start the application. Follow the on-screen prompts to manage your notes.

