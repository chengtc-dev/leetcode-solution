/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    var resetValue = init;

    return {
        increment : function(val) {
            return ++init;
        },
        reset : function() {
            init = resetValue;
            return init;
        },
        decrement : function(val) {
            return --init;
        },
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */