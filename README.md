#Board

A wrapper class for a 2D array of objects (implemented as a generic). 

#Introducing the Iterator!

A easier and quicker way to loop through a Board object.

Example code:

```
Board myBoard = new IntegerBoard("File.txt")
Iterator iter = myBoard.iterBoard();
while(iter.HasNext())
{
	BoardPiece<Integer> item = (BoardPiece<Integer>) iter.next();
	//do something with item.
}
```

#Version 1.2beta is Available!

* Created new Iterator for the Board!
* As well as Find, FindAll methods for all instances of AbstractBoard

#Version 1.1 Is Available!

* The previous Version1.0 is no longer supported.
* Version 2 Beta is no longer supported.
* To update. Checkout to the version1.1 branch
* New features include: Arithmetic Operations, including add, subtract, transpose, inverse, and determinant
* Contains Exception Handler for board to allow user or programmer to either ignore warnings or to handle errors.
* Improvements over Version 2 Beta

#Coming soon...

* Updated JavaDocs
* A better GUI for the ConsoleApplication