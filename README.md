# PocRoom

📱 **PocRoom** is a proof of concept for managing a SQLite database in Android using **Room** as an abstraction layer. This project demonstrates how to integrate Room into an Android app, enabling efficient local data management with a modern and scalable approach.

---

## 🛠️ Features

- 📋 **Full CRUD operations**: Create, Read, Update, and Delete records in a SQLite database.
- 🔍 **Advanced search**: Implementation of specific queries for optimized data access.
- 💾 **Local data management**: Utilizes Room to ensure data persistence and synchronization on the device.
- ✅ **Best practices**: Clean architecture with proper separation of concerns (MVVM).
- 🚀 **Optimization**: Supports asynchronous operations using **Coroutines**.

---

## 🏗️ Project Architecture

This project follows the **MVVM (Model-View-ViewModel)** architecture to maintain a modular, scalable, and easy-to-maintain structure.

- **Model**: Defines the database entities and their relationships.
- **ViewModel**: Manages the state of the views and business logic.
- **View**: Activities and fragments for user interaction.

---

## 🛠️ Technologies Used

- **Kotlin**: Primary programming language.
- **Room**: Database abstraction layer.
- **SQLite**: Local database management system.
- **Coroutines**: For handling asynchronous tasks.
- **Android Jetpack Components**: Includes ViewModel, LiveData, and other libraries.

---

## 🚀 Getting Started

Follow these steps to set up and run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/isperk/PocRoom.git
