public class SpaceAge {

    private int age;

    public SpaceAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double mercuryAge(){
       // Mercury: Orbital period 0.2408467 Earth years
         return (this.age / 0.2408467);
    }

    public double venusAge(){
       // Venus: Orbital period 0.61519726 Earth years
         return (this.age / 0.61519726);
    }

    public double EarthAge(){
       // Earth: Orbital period 365.25 Earth days, or 31,557,600 seconds
         return this.age;
    }

    public double marsAge(){
        //    Mars: Orbital period 1.8808158 Earth years
         return (this.age / 1.8808158);
    }

    public double jupiterAge(){
        //    Jupiter: Orbital period 11.862615 Earth years
         return (this.age / 11.862615);
    }

    public double saturnAge(){
        //    Saturn: Orbital period 29.447498 Earth years
         return (this.age / 29.447498);
    }

    public double uranusAge(){
        //    Uranus: Orbital period 84.016846 Earth years
         return (this.age / 84.016846);
    }

    public double neptuneAge(){
        //    Neptune: Orbital period 164.79132 Earth years
         return (this.age / 164.79132);
    }

    public double plutoAge(){
        //    Pluto: Orbital period 248.00 Earth years
         return (this.age / 248);
    }
}
