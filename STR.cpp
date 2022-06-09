#include <stdio.h>
class Node{
	public:
		int data;
        Node *next_element;
};
class LinkedList:public Node{
    protected:
	    Node *main_element; 
	public:
        void List1(){
    	    main_element=NULL;
	   }
	
        void add_Node_LinkedList(int number){
            Node *number2=new Node(); 
            number2->data=number;        
            number2->next_element=NULL;
			     
            if(main_element==NULL){
        	    main_element=number2;
		    }     
            else{
                Node *currented_element=main_element;

            while(currented_element->next_element!=NULL){
            	currented_element=currented_element->next_element;
			}
            currented_element->next_element=number2;
        }
    }
        void List(){
		    Node *currented_element=main_element;
			while(currented_element!=NULL){
                printf("%d\n",currented_element->data);
                currented_element=currented_element->next_element;
        }
    }
};
int main(){
    LinkedList mydata;
    
    mydata.add_Node_LinkedList(1);
    mydata.add_Node_LinkedList(2);
    mydata.add_Node_LinkedList(3);
    mydata.add_Node_LinkedList(4);
    mydata.add_Node_LinkedList(5);
    
    mydata.List();
    return 0;
}
