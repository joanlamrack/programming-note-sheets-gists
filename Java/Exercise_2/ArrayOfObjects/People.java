public class People{
    enum Gender{
        FEMALE("FEMALE"),
        MALE("MALE");

        private String gender;

        Gender(String gender){
            this.gender = gender;
        }

        @Override
        public String toString() {
            return this.gender;
        }
	};
	
	private String name;
	private Gender gender;
	private int phase;

    public People(String name, Gender gender, int phase){
        this.name = name;
		this.gender = gender;
		this.phase = phase;
    }
}