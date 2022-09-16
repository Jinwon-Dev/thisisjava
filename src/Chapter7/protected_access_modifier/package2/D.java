/* protected 접근 제한자 */
package Chapter7.protected_access_modifier.package2;

import Chapter7.protected_access_modifier.package1.A;

public class D extends A {
    public D() {
        super(); // (o)
        this.field = "value"; // (o)
        this.method(); // (o)
    }
}
