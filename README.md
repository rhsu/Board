# News!
This version is no longer supported. All the old proposed features of this version will no longer be implements as version3.0 will be used instead.

# Board

A 2-Dimensional Array Wrapper ... and more.

# General Idea

`Board2<T>` allows the client to easily access coordinates called `BoardPiece<T>`. For example, I have a 3 by 3 matrix. To get the first piece, I call `myBoard.getPieceAt(0, 0)`. The first parameter of the `pieceAt()` method is the horizontal coordinate. Hence, vertical is the second. 

# Architecture

Board features individual modules that extend the behavior of board. The current modules are `BoardIO`, `Matrix`, `Mobility`, `RandomGenerator`

# Modules

`BoardIO`: Allows the creation of board from a file. Allows the export of the board also

`Matrix`: Treats the board as a matrix. Supports Add, Subtract, Determinant, and Multiply

`Mobility`: Allows moving a piece from one location to another. Allows moving a piece from one board to another.

`RandomGenerator`: Creates a random board based off of the data type.

# Code To Build a Board

The easiest way to build a board is through the `BoardBuilder`

```
Board2<String> myBoard = new BoardBuilder<String>()
  .setHorizontalSize(3)
  .setVerticalSize(4)
  .createBoard()
```

To include a module attach it to the `BoardBuilder` like such

```

RandomGenerator<String> myGenerator = new SomeRandomGeneratorStringImplementation();

Board2<String> myBoard = new BasicBoardBuilder<String>()
   .setHorizontalSize(3)
   .setVerticalSize(4)
   .setRandomGenerator(myGenerator)
   .createBoard();
```

A `BoardFactoryClient` also exists to add in default modules without the client needing to know about them. To use the default `BoardIO`

```
Board2<String> myBoard = new BoardFactoryClient<String>()
   .GetStringBoardFactory()
   .createBoardFromFile("File.txt");
```

To create a random 7 by 8 board of GUIDs

```
Board2<String> myRandomBoard = new BoardFactoryClient<String>()
   .GetStringBoardFactory()
   .createRandomBoard(7,8);
```
