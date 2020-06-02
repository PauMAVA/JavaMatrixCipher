# JavaMatrixCipher
A simple program to encode and decode matrix ciphered text.

## Usage
First of all import the dependency and repository:
```xml
<repository>
    <id>PauMAVen</id>
    <url>https://raw.githubusercontent.com/PauMAVA/PauMAVen/master</url>
</repository>
```
```xml
<dependency>
    <groupId>me.PauMAVA</groupId>
    <artifactId>MatrixCipher</artifactId>
    <version>0.1.003</version>
</dependency>
```

### Encrypting text
```java
String encrypted = MatrixCipherTools.encrypt("Hello world, my name is PauMAVA");
// Encrypted text: Hl ly eormealo mPVw,a A dnsM!  iuA
```

### Decrypting text
```java
String decrypted = MatrixCipherTools.decrypt("Hl ly eormealo mPVw,a A dnsM!  iuA");
// Decrypted text: Hello world, my name is PauMAVA
```

## How it works
First of all you need to understand the two methods of iterating a matrix that this library uses.
### Natural iteration (left to right and up to down)
| \| | - | - | - | - | > |
|----|---|---|---|---|---|
| \| | - | - | - | - | > |
| \| | - | - | - | - | > |
| \| | - | - | - | - | > |
| \| | - | - | - | - | > |
| V | - | - | - | - | > |

### Diagonal iteration (diagonals from top-left corner)
| / | ^ | ^ | ^ | ^ | ^ |
|---|---|---|---|---|---|
| / | / | / | / | / | ^ |
| / | / | / | / | / | ^ |
| / | / | / | / | / | ^ |
| / | / | / | / | / | ^ |
| / | / | / | / | / | / |

### Encryption process
The text to be encrypted is written diagonally in a Character matrix:
| H | l |   | l | y | i |
|---|---|---|---|---|---|
| e | o | r | m |   | u |
| l | o |   | e | a | A |
| w | , | m | P | V |   |
| d | a |   | A |   |   |
| n | s | M |   |   |   |

Then the text is read in a natural reading order (left to right and up to down). 

### Decryption process
The text to be decrypted is written naturally in a Character matrix.
Then the text is read diagonally. 


