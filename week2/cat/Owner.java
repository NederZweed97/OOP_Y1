package week2.cat;

public class Owner {
    private Cat cat;

    public Owner(){}

    public Cat getCat() {
        return cat;
    }
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public void adoptCat(Cat cat){
        setCat(cat);
    }

    //for cat owners
    public String petCat(){
        if(this.cat == null){
            return "Kat rent weg";
        } else{
            cat.pet();
        }
        return "purrrr";
        
    }

    public String hisCatHappy(){
        if(this.cat == null){
            return "Kat houdt dat liever prive";
        }
        return this.cat.isHappy();
        
    }

    public String callCat(){
        if(this.cat == null){ 
            return "Oeps, dat is niet zijn naam";
        }
        return "Kom eens hier, " + this.cat.getName();
    }


    public void petUnknownCat(Cat c){
        c.pet();
    }

    
    
}
