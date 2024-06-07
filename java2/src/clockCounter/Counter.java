package clockCounter;

public class Counter
    {
        //Define the counter as a member of the class
        private int count;

        //Default constructor for Object counter
        Counter()
        {
            this.count = 0;
        }

        // parameter constructor for parameters of counter
        Counter(int count)
        {
            this.count = count;
//            setCount(count);
        }

        //Mutator for the counter object
        public void increaseCounter()
        {
//            this.count = this.count + 1;
            this.count++;

        }

        //Mutator for the counter object
        public void decreaseCounter()
        {
//            this.count = this.count - 1;
            this.count--;
        }

        //Mutator
        public void resetCount(){
            this.count = 0;
        }

        //Accessor
        public int getCount()
        {
            return count;
        }

        //Mutator for the counter object
        public void setCount(int count)
        {
            this.count = count;
        }



        public String toString(){
            return "Counter is: " + count;
        }
    }












