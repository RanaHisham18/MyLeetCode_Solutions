#include <vector> // Include for vector
#include <stack>  // Include for stack

class Solution {
public:
    std::vector<int> asteroidCollision(std::vector<int>& asteroids) {
        std::stack<int> orpt;
        for(int a : asteroids){
            re:if(!orpt.size()) orpt.push(a);
            else{
                if(a * orpt.top() > 0 || orpt.top() < 0) orpt.push(a);
                else{
                    if(abs(a) == abs(orpt.top())) orpt.pop();
                    else if(abs(a) > abs(orpt.top())){
                        orpt.pop();
                        goto re;
                    }
                }
            }
        }
        std::vector<int> rem;
        while(orpt.size()){
            rem.insert(rem.begin(), orpt.top());
            orpt.pop();
        }
        return rem;
    }
};
