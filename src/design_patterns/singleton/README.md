# Singleton Pattern

## Simple Meaning

Singleton means a class has only one object, and everyone uses that same object.

## When To Use

Use it when one shared object makes sense, like app settings, logging, or a shared cache.

## Main Idea

- Make the constructor private.
- Store one object inside the class.
- Give access through a static method like `getInstance()`.

## Example In This Folder

`Calculator` shows eager initialization.
`LazyInit` shows lazy initialization, where the object is created only when needed.

