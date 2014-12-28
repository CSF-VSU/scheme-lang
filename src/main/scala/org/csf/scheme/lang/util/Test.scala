package org.csf.scheme.lang.util

import org.csf.scheme.lang.interpret.Interpret

/**
 * Created by agpopikov on 22/12/14.
 */
object Test extends App {

  val source =
    """
      (define (bubble-up L)
          (if (null? (cdr L))
              L
              (if (< (car L) (cadr L))
                  (cons (car L) (bubble-up (cdr L)))
                  (cons (cadr L) (bubble-up (cons (car L) (cddr L)))))))

      (define (bubble-sort-aux N L)
          (cond ((= N 1) (bubble-up L))
                (else (bubble-sort-aux (- N 1) (bubble-up L)))))

      (define (bubbleH L)
          (bubble-sort-aux (length L) L))

      (write (bubbleH '(5 10 9 8 7)))
      (newline)

      (define fact (lambda (x) (if (= x 1) 1 (* x (fact (- x 1))))))
      (write (fact 10))
    """.stripMargin
  val interpret = new Interpret()
  interpret.interpret(source)
}
