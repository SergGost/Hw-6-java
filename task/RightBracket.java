// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

import java.util.HashMap;
import java.util.Stack;

public class RightBracket 
{
    public static void main(String[] args) 
    {
        String[] expressions = { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}" };
        for (String expression : expressions) 
        {
            boolean result = checkBrackets(expression);
            System.out.println(expression + " -> " + result);
        }
    }

    public static HashMap<Character, Character> getBracket() 
    {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put('>', '<');
        return brackets;
    }

    public static boolean checkBrackets(String expression) 
    {
        HashMap<Character, Character> brackets = getBracket();
        Stack<Character> openBracket = new Stack<>();
        for (char symbol : expression.toCharArray()) 
        {
            if (brackets.containsValue(symbol))
             {
                openBracket.push(symbol);
            } else if (brackets.containsKey(symbol)) 
            {
                if (openBracket.isEmpty() || openBracket.pop() != openBracket.get(symbol))
                 {
                    return false;
                }
            }
        }
        return openBracket.isEmpty();
    }
}
