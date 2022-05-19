import Data.Map (Map)
import qualified Data.Map as Map

l :: [Int]
l = [1, 2]

m :: Map Int String
m = Map.fromList [(1, "one"), (2, "two")]

main = return ()
