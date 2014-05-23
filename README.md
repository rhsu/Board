#Board

A wrapper class for a 2D array of objects (implemented as a generic). 

#Board2... Coming Soon...

* Board contains very bad semantics in how it is implemented. Board2 will be released to fix this. In the meantime, Version 1.3 will be the last release. 

#Version 1.3 Is Available!

* Improvements over 1.2beta
* Version 1.2beta is no longer supported
* The console application has been determined as not very useful and has been stripped. It may be repackaged in the future with better features.

#Iterator Warning!

* It seems that the iterator is not as fast as anticipated. While it is still usable, it is not as efficient as originally advertised.


#Introducing the Iterator!

A easier way loop through a Board object.

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

#Version 1.1 Is Available!

* The previous Version1.0 is no longer supported.
* Version 2 Beta is no longer supported.
* To update. Checkout to the version1.1 branch
* New features include: Arithmetic Operations, including add, subtract, transpose, inverse, and determinant
* Contains Exception Handler for board to allow user or programmer to either ignore warnings or to handle errors.
* Improvements over Version 2 Beta

#Coming soon...

* Updated JavaDocs
* Improvements to the iterator
