package GreetingKata;

public class Person {

    public String greet(String[] name) {
        char c;
        if (name != null && name.length != 0) {
            if (name.length < 2) {
                for (int i = 1; i < name[0].length(); i++){
                    c = name[0].charAt(i);
                    if (!Character.isLowerCase(c)){
                        return "HELLO, " + name[0] + "!";
                    }
                }
                return  "Hello, " + name[0] + ".";
            }
            String result = "Hello, " + name[0];
            for(int j = 1; j < name.length - 1; j++){
                result += (", " + name[j] + ",");
            }
            result += (" and " + name[name.length - 1] + ".");
            return result;

        }
        else {
            return "Hello, my friend.";
        }
    }
}
