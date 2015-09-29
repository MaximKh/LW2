class Mass {
    private int[] x;
    private int len;

    public Mass() {
        this.x = new int[5];
        for (int i = 0; i < 5; i++) {
            this.x[i] = (int) (Math.random() * 10);
        }
        this.len = 5;
    }

    public Mass(int len, int range) {
        this.x = new int[len];
        for (int i = 0; i < len; i++) {
            this.x[i] = (int) (Math.random() * range);
        }
        this.len = len;
    }
    public void selectionsort(){
        for(int i = 0; i < this.len - 1; i++){
            int min = i;
            for(int j = i + 1; j < this.len; j++){
                if(this.x[j] < this.x[min]){
                    min = j;
                }
            }
            this.swap(i, min);
        }
    }
    public void quicksort() {

    }
    public void swap(int a, int b){
        int temp;
        temp = this.x[a];
        this.x[a] = this.x[b];
        this.x[b] = temp;
    }

    public void print() {
        for (int i = 0; i < this.len; i++) {
            System.out.print(this.x[i] + "; ");
        }
        System.out.println();
    }
}
