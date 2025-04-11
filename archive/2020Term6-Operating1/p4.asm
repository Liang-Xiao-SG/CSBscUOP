//assignm value for array index 0
@5      //00  load 5 into A 
D=A     //01  save 5 into D register
@0      //02  load address of A[0]
M=D     //03  load A[0] with 5 

//assignm value for array index 1
@4      //04
D=A     //05
@1     //06
M=D    //07

//assignm value for array
@3      //08
D=A     //09
@2      //10
M=D     //11

//assignm value for array
@2     //12
D=A    //13
@3     //14
M=D    //15

//assignm value for array
@1     //16    
D=A    //17
@4     //18
M=D    //19

//assignm value for array
@0    //20    
D=A   //21
@5    //22
M=D  //23

//initialzie  i with 0
@0     //24     load  0 into i 
D=A    //25     D = 0  
@6     //26     use address 6 for i 
M=D    //27     i = 0 

//compare with 5 
@5     //28     //looping condition
D=A    //29     //load 5 into D
@6     //30          //load i 
D=M-D  //31      // if i > 5            
@48     //32     //set address to end 
D;JGT   //33    // jump if i > 5

//compare 0 with  A[i]
@0    //34
D=A            //save 0 into D
@6             // go to i address
A=M            //load new address with value of i 
D=D-M           //compare 0
@45            //jump increment if not equal to 0  
D;JNE           //jump to increment if not equal 0
@5              //load 5 into A
D=A             //load into D
@6              // load i 
A=M             // index of i now is the addres    
M=D             // change i value to 5 

//increment 
@6      //45          load i  
M=M+1   // i ++

@28     //47    unconditional jump
0;JMP   //48   