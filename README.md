# DogGPT

## Overview
DogGPT is a simple Java GUI application that generates random "woof" messages accompanied by images. This README provides an overview of the repository structure and the functionality of each Java file contained within.

## Repository Structure
The repository contains two additional folders:
- **pictures**: This folder stores singular images which are generated randomly as output frames.
- **src**: This folder contains the source code for the DogGPT application.

## Source Files

### DogGpt.java
This Java program initializes a graphical user interface (GUI) using the AWT (Abstract Window Toolkit) library. It schedules GUI-related code to run on the Event Dispatch Thread (EDT) and ensures proper thread management for GUI operations. Any exceptions during GUI initialization are caught and logged for debugging.

### Hehe.java
This class initializes a JFrame with a title "DogGPT" and dimensions of 600x500 pixels. The GUI consists of a JLabel displaying "DogGPT", JTextAreas displaying random "woof" messages, and a JButton for user interaction. Clicking the "Woof" button triggers an action to display a reply window.

### Woofrandom.java
This class generates random "woof" messages of varying lengths. It utilizes the Random class to generate random numbers and constructs random "woof" strings based on a specified range.

### Reply.java
This class creates a JFrame-based GUI window to display a reply from the application. It sets the window's title to "DogGPT" and dimensions to 600x500 pixels. The window contains a JLabel displaying "DogGPT", a JTextArea displaying the reply text, and an image randomly selected and resized to fit within the window.

## Summary
DogGPT is a simple Java GUI application demonstrating dynamic content generation and user interaction features. It generates random "woof" messages accompanied by images, showcasing basic Java GUI development techniques.
