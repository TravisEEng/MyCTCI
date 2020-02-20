N = 4


def rotateMatrix(mat):

    for x in range(0, int(N/2)):

        for y in range(x, N-x-1):

            #store current cell in temp
            temp = mat[x][y]

            #move values from right to top
            mat[x][y] = mat[y][N-1-x]

            #move from bottom to right
            mat[y][N-1-x] = mat[N-1-x][N-1-y]

            #left to bottom
            mat[N-1-x][N-1-y] = mat[N-1-y][x]

            #temp to left
            mat[N-1-y][x] = temp

def displayMatrix(mat):
    for i in range(0, N):
        for j in range(0, N):
            print(mat[i][j], end =' ')
        print("")

if __name__ == "__main__":
    mat = [[0 for x in range(N)] for y in range(N)]

    mat = [ [1,2,3,4],
            [5,6,7,8],
            [9,10,11,12],
            [13,14,15,16]]

    print("Before")
    displayMatrix(mat)
    print("~~~~~\nAfter")
    rotateMatrix(mat)
    displayMatrix(mat)