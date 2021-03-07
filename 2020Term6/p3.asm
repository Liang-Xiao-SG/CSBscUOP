// initialzie i j 
@0    //00   load 0 address for i 
MD=A  //01   load 0 value  into i address  
@1    //02   load 1 address for j    
M=D   //03   save 0 to M for j 

//conditional check entry
@0     //04  load 0 into A 
D=M    //05  load i value into D
@8     //06  go to increment logic 
D;JEQ  //07    jump if i eq 0 

//inner loop  increment for j
@1     //08   load j   
M=M+1  //09   incrment j 

// if check  j ==5 
@1     //10  load j 
D=M    //11  load j value into D
@5     //12  load 5 to A
D=D-A  //13  compare with j 
@4     //14  load PC of 4 at start of while
D;JNE  //15  back to start if not equal 
@1     //16  load j 
D=M    //17  save j value to D
@0     //18  load i 
M=D    //19  assign j to i 

@0     //20  load i     
D=M    //21  load d with value of i 
@4     //22   load address with entry of while
D;JEQ  //23   start again if i ==0
