class pall
{
static char []stack;
static int top = -1;
 

static void push(char ele)
{
    stack[++top] = ele;
}
 

static char pop()
{
    return stack[top--];
}
 

static int isPalindrome(char str[])
{
    int length = str.length;
 
   
    stack = new char[length * 4];
 
   
    int i, mid = length / 2;
 
    for (i = 0; i < mid; i++)
    {
        push(str[i]);
    }
 
   
    if (length % 2 != 0)
    {
        i++;
    }
 
   
    while (i < length)
    {
        char ele = pop();
 
       
        if (ele != str[i])
            return 0;
        i++;
    }
 
    return 1;
}
 

public static void main(String[] args)
{
    char str[] = "10011".toCharArray();
 
    if (isPalindrome(str) == 1)
    {
        System.out.printf("palindrom");
    }
    else
    {
        System.out.printf("Not a palindrom");
    }
}
}
 