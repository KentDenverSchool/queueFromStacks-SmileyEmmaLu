public class QueueFromStacks {

    private Stack enqueue;
    private Stack dequeue;


    public QueueFromStacks(){
        enqueue = new Stack();
        dequeue = new Stack();

    }

    public void enqueue(Object o){
        enqueue.push(o);
    }

    public Object dequeue(){

        if(dequeue.getSize() == 0){
            int enqueueSize = enqueue.getSize();
            for(int i = 0; i<enqueueSize; i++){
                dequeue.push(enqueue.pop());

            }

        }


        return dequeue.pop();
    }

    public boolean isEmpty(){
        if(getSize() == 0){
            return true;
        }

        else{
            return false;
        }
    }

    public Object peak(){
        if(dequeue.getSize() == 0){
            int enqueueSize = enqueue.getSize();
            for(int i = 0; i<enqueueSize; i++){
                dequeue.push(enqueue.pop());

            }

        }

        return dequeue.peak();
    }

    public int getSize(){
        return enqueue.getSize()+ dequeue.getSize();

    }

}
