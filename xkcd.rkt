#lang racket

(define (A m n);The Ackermann Function
  (cond
    ((= m 0) (+ n 1))
    ((and (> m 0) (= n 0)) (A (- m 1) 1))
    ((and (> m 0) (> n 0)) (A (- m 1) (A m (- n 1))))
  )
);http://en.wikipedia.org/wiki/Ackermann_function

(define (knuthUp a up b);Knuth's up-arrow notation
  (cond
    ((= up 1) (expt a b));a to the power of b
    ((= b 2) (knuthUp a (- up 1) a))
    (else (knuthUp a (- up 1) (knuthUp a up (- b 1))))
  )
);http://en.wikipedia.org/wiki/Knuth's_up-arrow_notation

(define (g sub);Graham's number can be defined by passing the parameter 64
  (cond
    ((= sub 1) (knuthUp 3 4 3))
    (else (knuthUp 3 (g (- sub 1)) 3))
  )
);http://en.wikipedia.org/wiki/Graham's_number

(define (xkcd) (A (g 64) (g 64)));xkcd.com/207 third panel