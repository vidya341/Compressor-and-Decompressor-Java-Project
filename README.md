# Compressor-and-Decompressor-Java-Project

## Objective of the project
Objective of the project is to reduce the number of bits needed to represent data through compression technique.
The project will only use lossless conversion to ensure no data loss occurs during compression.
## Technologies used in this project
Two technologies used in the project are Java and Java Swing(JFrame),
Java IO package is used to handle input and output streams for reading and writing data to files or other sources,
Input file is compressed and output file is generated using the Java IO package,
like buttons, labels, and texts,
JFrame represents the main window when executing the project,
The project includes a button that, when clicked, pops up a window to select a file to be compressed or decompressed.
## Explanation
This project implements a file chooser that helps choose a file from anywhere in the system and save the output file in the same folder.
"get parent" is used to method to get the parent directory of the input file.
File Input Stream to read the bytes of the input file.
File Output Stream to contain the output file in the same directory.
Gzip Output Stream to compress the file.
Gzip Input Stream to decompress the file.
