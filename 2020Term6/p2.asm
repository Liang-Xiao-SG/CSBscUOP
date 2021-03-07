// Problem 2
// if - then  - else

//i=4
//if (i < 5) then
//                j = 3
//else
//                j = 2
//initialzie i address for 0

@4   //00   load 4 to A
D=A  //01   save 4 into D
@0   //02   load use memory 0 
M=D  //03   save 4 at location 0

//Test if   value less than 5 

@0    //04    load i 
D=M   //05    not A cos use saved value
@5    //06    load 5 into A
D=D-A //07     evalue i with 5
@12     //08    load address 12 for less than condition 
D;JLT //09      jump if value less than 5
@17     //10     load address 17 for 
D;JGE //11       greater or equal 

//initialzie J to 2   j address is 1 
@2    //12
D=A   //13
@1    //14
M=D   //16

//initialzie J to 3
@3    //17
D=A   //18
@1    //19
M=D   //20

