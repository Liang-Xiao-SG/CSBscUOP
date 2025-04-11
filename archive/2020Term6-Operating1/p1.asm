//J=5
//for(i=1; i<5; i++) {
//               j--
//}
//    PC

//initialzie J 

@5   //00   load 5 into A
D=A  //01   save 5 into D
@0   //02   load use memory 0 
M=D  //03   save 5 at location 0

//initialzie i
@1   //04   load 1 to A
D=A  //05   change D to 1 
@1   //06
M=D  //07

//Test if   value less than 5 
@1    //08    load i 
D=M   //09    not A cos use saved value
@5    //10    load 5 into A
D=D-A //12     evalue i with 5
@21   //13     load address 21 
D;JGE //14     jump if value larger than 5

//increment for i 
@1    //15    load i at position 1  
M=M+1 //16    M++

//decrement for J
@0     //17
M=M-1  //18

// unconditional jump
@8    //19
D;JMP //20  

//end of loop
@21  //21