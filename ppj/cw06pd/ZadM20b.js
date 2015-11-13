function eosort(t) {

    console.log(t.join(' '));

    var b = [t.filter(x => x % 2 == 0).sort(),
             t.filter(x => x % 2).sort().reverse()],
        i = [0,0], r = t.map(x => b[x%2][i[x%2]++]);

    console.log(r.join(' ')+"\n");

}

var t = [[0,1,2,3,4,5,6,7,8,9],
         [8,2,0,6,4,3,5,9,1,7],
         [9,7,1,2,8,6,5,3,4,0]];

t.forEach(x => eosort(x));
