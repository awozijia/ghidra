/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class InvokeVirtual{

    public int callInts(){
        int a = 2;
        int b = 1;
        a = func1_1(a);
        b = func1_1_1(a,b);
        return a + b;
    }
    

    public void func0_0(){
        return;
    }

    public void func0_1(int a){
        a++;
        return;
    }

    public void func0_2(long a){
        a++;
        return;
    }    

    public int func1_1(int a){
        return a + 1;
    }

    public int func1_1_1(int a, int b){
        return a + b;
    }

    public long func2_2(long a){
        return a + 1;
    }
    
    public long func2_2_2(long a, long b){
        return a + b;
    }

    public long mixed(int a, long b, int c, long d){
        return a + (int) b + c + (int) d;
    }

    public long longTest1(long l, InvokeVirtual test){
        long a = test.func2_2(l);
        return a;
    }

    public long getLong(){
        return 1L;
    }

    public long callsLongReturner(){
        long a = getLong();
        return a;
    }

    public long longAndVoidTest(long a, long b){
        long c = a + b;
        func0_2(c);
        long d = getLong();
        return c + d;
    }

    public long longTest2(long a, long b){
       long c = func2_2(a);
       long d = func2_2(b);
       long e = func2_2_2(c,d);
       return e + 1;
    }


}
