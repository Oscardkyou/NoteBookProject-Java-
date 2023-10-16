
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


оздание новой ветки:

Запустите следующую команду, где new-branch-name — это имя вашей новой ветки:

bash

git checkout -b new-branch-name

Внесение изменений:

Внесите необходимые изменения в вашем проекте. Когда вы будете готовы закоммитить их, выполните:

bash

git add .
git commit -m "Описание ваших изменений"

Загрузка ветки на сервер:

Запустите следующую команду, чтобы загрузить вашу новую ветку на сервер:

bash

git push origin new-branch-name

Если вы ещё не связали ваш локальный репозиторий с удаленным, выполните:

bash

git remote add origin URL_ВАШЕГО_РЕПОЗИТОРИЯ

а затем выполните git push как указано выше.

Создание pull request:

После того как вы загрузили ветку на сервер, перейдите на веб-страницу вашего репозитория (например, на GitHub, GitLab или Bitbucket). Вы должны увидеть предложение создать новый pull request для вашей ветки. Следуйте инструкциям на веб-странице, чтобы завершить создание pull request.
