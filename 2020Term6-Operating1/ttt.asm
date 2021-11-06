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

@j     //24             16
@flag  //25          17
M=1
@temp   //27         //18
(WHILE)
@flag		//28
D=M			//29
@1			//30
D=D-A
@END
D;JNE
@flag
M=0

@j
M=0
(FOR)
@j
D=M
@6
D=D-A
@WHILE
D;JGE

//A[i] A[i+1]
@j
A=M
D=M

@j
A=M+1
D=D-M
@ENDLOOP
D;JLE // jump if A[j] <= A[J+1]

//temp = A[J]
@j
A=M
D=M
@temp
M=D

//A[ j ] = A[ j+1 ]
@j
A=M+1
D=M
@j
A=M
M=D

//A[ j+1 ] = temp;
@temp
D=M
@j
A=M+1
M=D

//flag=1
@flag
M=1
//  j++
(ENDLOOP)
@j
M=M+1
@FOR
0;JMP

(END)
@END
0;JMP
