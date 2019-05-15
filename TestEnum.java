enum Animals {
DOG("woof"), CAT("meow"), FISH("burble");
String sound;
Animals(String s) { sound = s; }
}
class TestEnum {
static Animals a;
int ya=1_0;
int d=0b001;

public static void main(String[] args) {
System.out.println(a.DOG.sound + " " + a.FISH.sound);
}
}