

package GreetingKata;

public class Person {

    public String greet(String[] name) {
        char c;
        String uppers = "";
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
            if (name.length == 2){
                if(name[1].contains("\"")) {
                    name[1] = name[1].replace("\"", "");
                    return "Hello, " + name[0] + " and " + name[1]  + ".";
                }


                if (name[1].contains(",")){
                    String[] vals = name[1].split(", ");
                    return "Hello, " + name[0] + ", " + vals[0] + ", and " + vals[1] + ".";
                }

            }
            String result = "Hello, " + name[0];
            for(int j = 1; j < name.length - 1; j++){
                if (Character.isLowerCase(name[j].charAt(1))) {
                    result += (", " + name[j] + ",");
                }
                else{
                    uppers += " AND HELLO " + name[j] + "!";
                }

            }
            result += (" and " + name[name.length - 1] + ".");
            return result + uppers;

        }
        else {
            return "Hello, my friend.";
        }
    }
}