# MedBot

## FrontEnd

- The frontend is done in kotlin.
- Use android studio to compile to an android app.
- Make sure you create a firebase and update the link in kotlin.
- The file to change it is : front\app\src\main\java\com\project\healthcarebot\realtimedatabase\RealtimeDatabaseRepository.kt

## BackEnd

- We are using python for backend.
- For its integration with frontend we are using firebase.
- Make sure you change the link for firebase to your own.
- The path to file for changing it is : back\listen.py
- Also make sure to take a api key from openai and update it in : back\gpt.py
- Run the below code in terminal to download the model :
    - python -m spacy download en_core_web_sm

## Running The project

- Make sure to install required libraries.
- Sorry for not providing the requirement.txt
- If you have to use android app, run listen.py
- else run run.py
