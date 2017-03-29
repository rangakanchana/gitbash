package com.Arrays;
import java.util.Stack;


public class BalancedParanthesis {
	
	public static boolean validExpression(String s)
		{
			Stack <Character> st = new Stack <Character> ();


			for (int i = 0; i < s.length(); i++)
			{
				if ((s.charAt(i) == '(') || (s.charAt(i) == '{') || (s.charAt(i) == '['))
				{
					st.push(s.charAt(i));
				}
				
				if (s.charAt(i) == ')')       
				{
					if (st.empty())
					{
						return false;
					}
					
					char c = st.pop();
					
					if (c == '[')
					{
						return false;
					}
					else if (c == '{')
					{
						return false;
					}
					else
					{
						continue;
					}
				}  


				if (s.charAt(i) == ']') 
				{
					if (st.empty())
					{
						return false;
					}
					char c = st.pop();
					if (c == '(')
					{
						return false;
					}
					else if (c == '{')
					{
						return false;
					}
					else
					{
						continue;
					}
				}  


				if (s.charAt(i) == '}') 
				{
					if (st.empty())
					{
						return false;
					}
					char c = st.pop();
					if (c == '[')
					{
						return false;
					}
					else if (c == '(')
					{
						return false;
					}
					else
					{
						continue;
					}
				}  	
			}


			if (st.empty())
			{
				return true;
			}


			return false;
		}


		public static void main(String [] args)
		{
			String unbalanced_exp1 = "((())";
			String balanced_exp2 = "((()))";
			String unbalanced_exp3 = "((()}]";
			String balanced_exp4 = "[{()}]";
			String balanced_exp5 = "{[([])]}([])";


			System.out.println(validExpression(unbalanced_exp1));
			System.out.println(validExpression(balanced_exp2));
			System.out.println(validExpression(unbalanced_exp3));
			System.out.println(validExpression(balanced_exp4));
			System.out.println(validExpression(balanced_exp5));




		}
	

}
