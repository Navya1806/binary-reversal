# Inslight Global Binary Reversal Challenge Application API
Have the function BinaryReversal(str) take the str parameter being passed, which will be a positive
integer, take its binary representation (padded to the nearest N * 8 bits), reverse that string of bits, and
then finally return the new reversed string in decimal form. For example: if str is &quot;47&quot; then the binary
version of this integer is 101111 but we pad it to be 00101111. Your program should reverse this binary
string which then becomes: 11110100 and then finally return the decimal version of this string, which is
244.
## Tech Stack
| Technology | Version | Purpose |
| ------ | ------ | ------ |
| Java | 11| Programming Language |
| SpringBoot | 2.4.3 | Application Framework |
| Embedded Tomcat Server | 9 | To Deploy Application |
| Maven |   | Build Tool |
| Swagger OpenApi | 3.0 | API Dcoumentaion and Testing |
| Junit, Mockito | 5 | Unit Test Cases |
| Log4j | 2.1.3 | To maintain Logs |


## Rest Apis Info
here we used 1 api which takes integer value as a string
follwoing are the request and responses
##### Request: getBinaryReversalValue
value = "47"
##### Response:
"244"

##### swagger url:
http://localhost:8081/swagger-ui.html

![swagger](https://user-images.githubusercontent.com/81264996/112221015-f003e400-8bf4-11eb-9160-1eb71b47c470.JPG)


```sh
Swagger Api Request
```
![swagger-request](https://user-images.githubusercontent.com/81264996/112221082-027e1d80-8bf5-11eb-9269-d4959ff0b275.JPG)
```sh
Swagger Api Response
```
![swagger-response](https://user-images.githubusercontent.com/81264996/112221105-0e69df80-8bf5-11eb-93b9-2f46e6dff378.JPG)

```sh
Test Cases Results
```
![test-cases](https://user-images.githubusercontent.com/81264996/112221174-22addc80-8bf5-11eb-9504-5e584070818c.JPG)

```sh
Code Coverage
```
![code-covergae](https://user-images.githubusercontent.com/81264996/112221217-2e010800-8bf5-11eb-99ab-5dacce61aff0.JPG)

