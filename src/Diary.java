public interface Diary implements Book, Notebook{
    @Override
    public void youCanRead(){
        System.out.println("Read");
    }
    @Override
    public void youCanWrite(){
        System.out.println("Write");
    }
}