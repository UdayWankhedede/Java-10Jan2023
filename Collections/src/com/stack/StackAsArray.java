package com.stack;


class MyStack
{
	int top ;
	int size;
	int[] stk;
	
	public MyStack()
	{
		
	}
	public MyStack(int isize)
	{
		top = 1;
		this.size= size;
		stk = new int [size];
	}
	
	void push(int data)
	{
		if(top < size)
		{
			top++;
			stk[top]=data;
			System.out.println("Element inserted" + data);
		}
		else
		{
			System.out.println("Stack isfull");
		}
	}
	void pop()
	{
		if(top!=-1)
		{
			System.out.println("Element deteted:"+stk[top]);
			top--;
		}
		else
			System.out.println("Stack is empty");
	}
	void show()
	{
		if(top != -1)
		{
			for(int i =0; i <= top; i++)
			{
				System.out.println(stk[i] + " ");
			}
		}
		else 
		{
			System.out.println("Stack is empty");
		}
	}
}
public class StackAsArray 
{
	public static void main(String[] args) {
		MyStack s1 = new MyStack(5);
//		s1.pop();
//		s1.show();
		s1.push(55);
		s1.push(11);
		s1.push(21);
//		s1.push(31);
//		s1.push(41);
		s1.show();
		
	}
}
