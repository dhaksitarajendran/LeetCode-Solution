class Solution {
public:
    ListNode* reverse(ListNode* l1){
        if(l1==NULL) return NULL;
        ListNode* curr=l1;
        ListNode* prev=NULL;
        ListNode* nextt=NULL;
        while(curr!=NULL){
            nextt=curr->next;
            curr->next=prev;
            prev=curr;
            curr=nextt;
        }
        return prev;
    }
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        if(l1==NULL && l2==NULL) return NULL;
        if(l1==NULL && l2!=NULL) return l2;
        if(l2==NULL && l1!=NULL) return l1;
        ListNode* ll1=l1;
        ListNode* ll2=l2;
        int carry=0;
        ListNode* curr=new ListNode(0);
        ListNode* temp=curr;
        while(ll1!=NULL || ll2!=NULL){
            int n1=(ll1!=NULL) ? ll1->val:0;
            int n2=(ll2!=NULL) ? ll2->val:0;
            int sum=n1+n2+carry;
            carry=sum/10;
            temp->next=new ListNode(sum%10);
            temp=temp->next;
            if(ll1!=NULL) ll1=ll1->next;
            if(ll2!=NULL) ll2=ll2->next;
        }
        while(carry>0){
            temp->next=new ListNode(carry%10);
            carry=carry/=10;
            temp=temp->next;
        }
        ListNode* ans=reverse(curr->next);
        ListNode* res=reverse(ans);
        return res;
    }
};
